package org.wzorce.kreacyjne.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonExampleUT {

    @Test
    public void checkReferencesNotEquals() {
        NonUnicalObject nonUnicalObject1 = new NonUnicalObject();
        NonUnicalObject nonUnicalObject2 = new NonUnicalObject();

        Assertions.assertNotEquals(nonUnicalObject1, nonUnicalObject2);
    }

    @Test
    public void checkReferencesEquals() {
        UnicalObject unicalObject1 = UnicalObject.getInstance();
        UnicalObject unicalObject2 = UnicalObject.getInstance();

        Assertions.assertEquals(unicalObject1, unicalObject2);
    }

}
