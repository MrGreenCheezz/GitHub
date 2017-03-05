package pegasuscraft.ptm.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import pegasuscraft.ptm.TechnoMod;

public class StrangeArmor extends ItemArmor {

	public StrangeArmor(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
		super(armourMaterial, renderIndex, armourType);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return "ptm:textures/models/armor/strange_layer_2.png";
		}
		return "ptm:textures/models/armor/strange_layer_1.png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(TechnoMod.strangeboots) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(TechnoMod.strangeleggings) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(TechnoMod.strangechestplate) && player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(TechnoMod.strangehelmet)){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
			player.addPotionEffect(new PotionEffect(Potion.hunger.id, 40));
		}
	}
}
