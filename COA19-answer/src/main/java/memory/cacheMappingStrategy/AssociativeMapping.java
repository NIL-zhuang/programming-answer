package memory.cacheMappingStrategy;

import memory.Cache;
import memory.Memory;
import transformer.Transformer;

public class AssociativeMapping extends MappingStrategy {  // 全相联映射

    /**
     * @param blockNO 内存数据块的块号
     * @return cache数据块号 22-bits  [前22位有效]
     */
    @Override
    public char[] getTag(int blockNO) {
        // TODO
        return null;
    }

    @Override
    public int map(int blockNO) {
        // TODO
        return -1;
    }

    @Override
    public int writeCache(int blockNO) {
        // TODO
        return -1;
    }
}
