package org.zlibrary.model.impl;

import org.zlibrary.model.entry.ZLTextControlEntry;

public class ZLTextControlEntryImpl implements ZLTextControlEntry {
    private byte myKind;
    private boolean myStart;

    ZLTextControlEntryImpl(byte kind, boolean isStart) {
        myKind = kind;
        myStart = isStart;
    }

    public byte getKind() {
        return myKind;
    }

    public boolean isStart() {
        return myStart;
    }
    
    public  boolean isHyperlink() {
    	return false;
    }
}
