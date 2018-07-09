package net.samtrion.compactdrawers.block;

import com.jaquadro.minecraft.storagedrawers.api.storage.IDrawerGeometry;

public enum EnumCompactDrawer2By2Half implements IDrawerGeometry, IDrawerSerializable {
    L2R2(0, 4, "l2r2"),
    L1R2(1, 2, "l1r2"),
    L2R1(2, 2, "l2r1"),
    L1R1(3, 0, "l1r1");
    
    private static final EnumCompactDrawer2By2Half[] META_LOOKUP;

    private final int                            meta;
    private final int                            openSlots;
    private final String                         name;

    EnumCompactDrawer2By2Half(int meta, int openSlots, String name) {
        this.meta = meta;
        this.name = name;
        this.openSlots = openSlots;
    }

    static {
        META_LOOKUP = new EnumCompactDrawer2By2Half[values().length];
        for (EnumCompactDrawer2By2Half type : values()) {
            META_LOOKUP[type.getMetadata()] = type;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDrawerCount() {
        return 4;
    }

    @Override
    public boolean isHalfDepth() {
        return true;
    }

    @Override
    public int getMetadata() {
        return meta;
    }

    public int getOpenSlots() {
        return openSlots;
    }
}