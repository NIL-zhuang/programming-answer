package memory.cacheReplacementStrategy;

import memory.Cache;

/**
 * 最近最少用算法
 */
public class LRUReplacement extends ReplacementStrategy {

    /**
     *
     * @param start 起始位置
     * @param end 结束位置 闭区间
     */
    @Override
    public int isHit(int start, int end,char[] addrTag) {
        // TODO
        return -1;
    }


    /**
     * 找到最小时间戳的行，替换
     * @param start 起始行
     * @param end 结束行 闭区间
     * @param addrTag tag
     * @param input  数据
     * @return
     */
    @Override
    public int writeCache(int start, int end, char[] addrTag, char[] input) {
        // TODO
        return -1;
    }

}





























