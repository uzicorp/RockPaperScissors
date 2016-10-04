package com.uzicorp.abs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usman on 23/09/16.
 */
public class RockAbs extends ItemsAbs {

    List<ItemsAbs> beats() {

        List<ItemsAbs> beats = new ArrayList();
        beats.add(new ScissorsAbs());
        return beats;
    }
}
