package net.ilexiconn.jurassicraft.common.api;

import net.minecraft.item.ItemBlock;

public interface ISubBlocksBlock {
    Class<? extends ItemBlock> getItemBlockClass();
}