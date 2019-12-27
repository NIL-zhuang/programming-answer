package cpu;

import cpu.instr.all_instrs.InstrFactory;
import cpu.instr.all_instrs.Instruction;
import cpu.registers.EIP;
import cpu.registers.Register;
import transformer.Transformer;

public class CPU {

    static Transformer transformer = new Transformer();
    static MMU mmu = MMU.getMMU();


    public CPU() {}

    /**
     * execInstr specific numbers of instructions
     *
     * @param number numbers of instructions
     */
    public int execInstr(long number) {
        // 执行过的指令的总长度
        int totalLen = 0;
        while (number > 0) {
            int instrLength = execInstr();
            if (0 > instrLength) {
            	break;
			} else {
				number--;
				totalLen += instrLength;
				((EIP)CPU_State.eip).plus(instrLength);
			}
        }
        return totalLen;
    }

    public void execUntilHlt(){
        ControlUnit.exec();
    }

    /**
     * execInstr a single instruction according to eip value
     */
    private int execInstr() {
        String eip = CPU_State.eip.read();
        return decodeAndExecute(eip);
    }

    private int decodeAndExecute(String eip) {
        //Fetch the target executor class according to opcode
        int opcode = instrFetch(eip, 1);
        Instruction instruction = InstrFactory.getInstr(opcode);
        assert instruction != null;

        //exec the target instruction
//        int len = (int) ControlUnit.exec(instruction, eip);
        instruction.fetchInstr(eip, opcode);
        return instruction.exec(opcode);

    }

    /**
     * @param eip
     * @param length opcode的字节数，本作业只使用单字节opcode
     * @return
     */
    public static int instrFetch(String eip, int length) {
        /**
         * 目前默认只有一个数据段
         */
        Register cs = CPU_State.cs;

        // length = length * 8  一个字节8位
        String opcode = String.valueOf(mmu.read(cs.read() + eip, length * 8));
        return Integer.parseInt(transformer.binaryToInt(opcode));
    }

}

