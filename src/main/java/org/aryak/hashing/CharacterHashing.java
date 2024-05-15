package org.aryak.hashing;

public class CharacterHashing {

    int [] hash;

    /**
     * precompute the hash here
     *
     * @param ch
     */
    public CharacterHashing(char [] ch) {
        hash = new int[256];
        for ( char c : ch ) {
            hash[c]++;
        }
    }

    public int getOccurence(char c){
        return this.hash[c];
    }
}
