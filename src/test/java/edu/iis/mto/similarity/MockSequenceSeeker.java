package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

/**
 * Created by grusz on 19.03.2017.
 */
public class MockSequenceSeeker implements SequenceSearcher {

    private class MockSearchResult implements SearchResult {

        private final boolean found;
        private final int position;

        public MockSearchResult(boolean found, int position) {
            this.found = found;
            this.position = position;
        }

        public boolean isFound() {
            return found;
        }

        public int getPosition() {
            return position;
        }
    }

    public SearchResult search(int i, int[] ints) {
        for(int j=0;j<ints.length;j++){
            if(ints[j]==i){
                return new MockSearchResult(true,j);
            }
        }
    }
}
