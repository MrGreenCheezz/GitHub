package pegasuscraft.ptm;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCreate extends Block {
	protected BlockCreate(Material material,String name,String text) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName("ptm:" + text);
		this.setCreativeTab(TechnoMod.tabPegasus);
		
	}
 public static final void init(Block block,String bname){
	 GameRegistry.registerBlock(block, bname);
	 
 }
}
