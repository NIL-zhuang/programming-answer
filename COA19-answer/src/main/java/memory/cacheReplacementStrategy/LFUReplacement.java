package memory.cacheReplacementStrategy;

import memory.Cache;

/**
 * 最近不经常使用算法
 */
public class LFUReplacement extends ReplacementStrategy {

    @Override
    public int isHit(int start, int end, char[] addrTag) {
        // TODO
        return -1;
    }

    @Override
    public int writeCache(int start, int end, char[] addrTag, char[] input) {
        // TODO
        return -1;
    }
}
