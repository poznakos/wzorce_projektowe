package org.wzorce.kreacyjne.singleton;

public class UnicalObject {

    private static UnicalObject INSTANCE = null;

    private UnicalObject() {
    }

    public static UnicalObject getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnicalObject();
        }
        return INSTANCE;
    }

}
