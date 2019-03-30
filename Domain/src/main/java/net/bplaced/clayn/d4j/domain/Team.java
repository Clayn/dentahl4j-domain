package net.bplaced.clayn.d4j.domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Clayn <clayn_osmato@gmx.de>
 * @since 0.1
 */
public class Team
{

    private final Map<Integer, Ninja> positions = new HashMap<>();

    public Map<Integer, Ninja> getPositions()
    {
        return positions;
    }

}
