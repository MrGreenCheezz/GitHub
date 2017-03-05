package pegasuscraft.ptm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Energizer extends Block {
	public IIcon[] icons = new IIcon[6];

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.icons[1] = reg.registerIcon("ptm:energizer_top");
		this.icons[2] = reg.registerIcon("ptm:energizer_face");
		this.icons[0] = reg.registerIcon("ptm:energizer_top");
		this.icons[3] = reg.registerIcon("ptm:energizer_side");
		this.icons[4] = reg.registerIcon("ptm:energizer_side");
		this.icons[5] = reg.registerIcon("ptm:energizer_side");
	}

	

	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}

	protected Energizer(Material material) {
		super(material);
		this.setBlockName("Energizer");
		this.setCreativeTab(TechnoMod.tabPegasus);
		this.setBlockTextureName("ptm:wtfore");
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		
	}

}
