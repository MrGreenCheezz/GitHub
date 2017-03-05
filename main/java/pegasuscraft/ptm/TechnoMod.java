package pegasuscraft.ptm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import pegasuscraft.ptm.item.ItemStrangeAxe;
import pegasuscraft.ptm.item.ItemStrangeHoe;
import pegasuscraft.ptm.item.ItemStrangePickaxe;
import pegasuscraft.ptm.item.ItemStrangeShovel;
import pegasuscraft.ptm.item.ItemStrangeSword;
import pegasuscraft.ptm.item.ItemToStrangeAxe;
import pegasuscraft.ptm.item.ItemToStrangeHoe;
import pegasuscraft.ptm.item.ItemToStrangePickaxe;
import pegasuscraft.ptm.item.ItemToStrangeShovel;
import pegasuscraft.ptm.item.ItemToStrangeSword;
import pegasuscraft.ptm.item.StrangeArmor;

@Mod(modid = "ptm", name = "PTM", version = "0.2a")
public class TechnoMod {

	public static Block strangeore;
	public static Block tostrangeore;
	public static Block verystrangeore;
	public static Block wtfore;
	public static Block newblock;

	public static Item strangeshard;
	public static Item tostrangeshard;
	public static Item verystrangeshard;
	public static Item wtfshard;
	
	public static Item strangeaxe;
	public static Item strangepickaxe;
	public static Item strangehoe;
	public static Item strangeshovel;
	public static Item strangesword;
	public static Item tostrangeaxe;
	public static Item tostrangepickaxe;
	public static Item tostrangehoe;
	public static Item tostrangeshovel;
	public static Item tostrangesword;

	public static Item strangehelmet;
	public static Item strangechestplate;
	public static Item strangeleggings;
	public static Item strangeboots;
	
	public static Block energizer;
	public static Block energizeractive;

	public static final Item.ToolMaterial strangematerial = EnumHelper.addToolMaterial("strangematerial", 4, 250, 20.0F,
			5.0F, 20);
	public static final ItemArmor.ArmorMaterial strangearmormaterial = EnumHelper
			.addArmorMaterial("StrangeArmorMaterial", 3000, new int[] { 3, 7, 7, 2 }, 30);
	public static final Item.ToolMaterial tostrangematerial = EnumHelper.addToolMaterial("strangematerial", 4, 700, 25.0F,
			18.0F, 20);
	public static final ItemArmor.ArmorMaterial tostrangearmormaterial = EnumHelper
			.addArmorMaterial("StrangeArmorMaterial", 6000, new int[] { 6, 14, 14, 4 }, 45);
	public static final Item.ToolMaterial verystrangematerial = EnumHelper.addToolMaterial("strangematerial", 4, 1000, 30.0F,
			20.0F, 20);
	public static final ItemArmor.ArmorMaterial verystrangearmormaterial = EnumHelper
			.addArmorMaterial("StrangeArmorMaterial", 9000, new int[] { 9, 21, 21, 8 }, 50);

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		// Предметы 1
		strangepickaxe = new ItemStrangePickaxe(strangematerial).setUnlocalizedName("StrangePickaxe")
				.setTextureName("ptm:strangepickaxe").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(strangepickaxe, strangepickaxe.getUnlocalizedName().substring(5));
		strangeaxe = new ItemStrangeAxe(strangematerial).setUnlocalizedName("StrangeAxe")
				.setTextureName("ptm:strangeaxe").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(strangeaxe, strangeaxe.getUnlocalizedName().substring(5));
		strangehoe = new ItemStrangeHoe(strangematerial).setUnlocalizedName("StrangeHoe")
				.setTextureName("ptm:strangehoe").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(strangehoe, strangehoe.getUnlocalizedName().substring(5));
		strangeshovel = new ItemStrangeShovel(strangematerial).setUnlocalizedName("StrangeShovel")
				.setTextureName("ptm:strangeshovel").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(strangeshovel, strangeshovel.getUnlocalizedName().substring(5));
		strangesword = new ItemStrangeSword(strangematerial).setUnlocalizedName("StrangeSword")
				.setTextureName("ptm:strangesword").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(strangesword, strangesword.getUnlocalizedName().substring(5));
		//Предметы 2
		tostrangepickaxe = new ItemToStrangePickaxe(tostrangematerial).setUnlocalizedName("ToStrangePickaxe")
				.setTextureName("ptm:tostrangepickaxe").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(tostrangepickaxe, tostrangepickaxe.getUnlocalizedName().substring(5));
		tostrangeaxe = new ItemToStrangeAxe(tostrangematerial).setUnlocalizedName("ToStrangeAxe")
				.setTextureName("ptm:tostrangeaxe").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(tostrangeaxe, tostrangeaxe.getUnlocalizedName().substring(5));
		tostrangehoe = new ItemToStrangeHoe(tostrangematerial).setUnlocalizedName("ToStrangeHoe")
				.setTextureName("ptm:tostrangehoe").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(tostrangehoe, tostrangehoe.getUnlocalizedName().substring(5));
		tostrangeshovel = new ItemToStrangeShovel(tostrangematerial).setUnlocalizedName("ToStrangeShovel")
				.setTextureName("ptm:tostrangeshovel").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(tostrangeshovel, tostrangeshovel.getUnlocalizedName().substring(5));
		tostrangesword = new ItemToStrangeSword(tostrangematerial).setUnlocalizedName("ToStrangeSword")
				.setTextureName("ptm:tostrangesword").setCreativeTab(tabPegasus);
		GameRegistry.registerItem(tostrangesword, tostrangesword.getUnlocalizedName().substring(5));
		// Дроп и шарды
		tostrangeshard = new StrangeShard().setUnlocalizedName("ToStrangeShard").setTextureName("ptm:tostrangeshard")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerItem(tostrangeshard, tostrangeshard.getUnlocalizedName().substring(5));
		verystrangeshard = new StrangeShard().setUnlocalizedName("VeryStrangeShard").setTextureName("ptm:verystrangeshard")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerItem(verystrangeshard, verystrangeshard.getUnlocalizedName().substring(5));
		strangeshard = new StrangeShard().setUnlocalizedName("StrangeShard").setTextureName("ptm:strangeshard")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerItem(strangeshard, strangeshard.getUnlocalizedName().substring(5));
		wtfshard = new StrangeShard().setUnlocalizedName("WTFShard").setTextureName("ptm:wtfshard")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerItem(wtfshard, wtfshard.getUnlocalizedName().substring(5));
		// Руда
		strangeore = new StrangeOre(Material.rock).setBlockName("StrangeOre").setBlockTextureName("ptm:strangeore")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerBlock(strangeore, strangeore.getUnlocalizedName().substring(5));
		tostrangeore = new ToStrangeOre(Material.rock).setBlockName("ToStrangeOre").setBlockTextureName("ptm:tostrangeore")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerBlock(tostrangeore, tostrangeore.getUnlocalizedName().substring(5));
		verystrangeore = new VeryStrangeOre(Material.rock).setBlockName("VeryStrangeOre").setBlockTextureName("ptm:verystrangeore")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerBlock(verystrangeore, verystrangeore.getUnlocalizedName().substring(5));
		wtfore = new WTFStrangeOre(Material.rock).setBlockName("WTFOre").setBlockTextureName("ptm:wtfore")
				.setCreativeTab(tabPegasus);
		GameRegistry.registerBlock(wtfore, wtfore.getUnlocalizedName().substring(5));
		// Броня
		strangehelmet = new StrangeArmor(strangearmormaterial, 0, 0).setUnlocalizedName("StrangeHelmet")
				.setTextureName("ptm:strangehelmet").setCreativeTab(tabPegasus);
		;
		GameRegistry.registerItem(strangehelmet, strangehelmet.getUnlocalizedName().substring(5));
		strangechestplate = new StrangeArmor(strangearmormaterial, 0, 1).setUnlocalizedName("StrangeChestplate")
				.setTextureName("ptm:strangechestplate").setCreativeTab(tabPegasus);
		;
		GameRegistry.registerItem(strangechestplate, strangechestplate.getUnlocalizedName().substring(5));
		strangeleggings = new StrangeArmor(strangearmormaterial, 0, 2).setUnlocalizedName("StrangeLeggings")
				.setTextureName("ptm:strangeleggings").setCreativeTab(tabPegasus);
		;
		GameRegistry.registerItem(strangeleggings, strangeleggings.getUnlocalizedName().substring(5));
		strangeboots = new StrangeArmor(strangearmormaterial, 0, 3).setUnlocalizedName("StrangeBoots")
				.setTextureName("ptm:strangeboots").setCreativeTab(tabPegasus);
		;
		GameRegistry.registerItem(strangeboots, strangeboots.getUnlocalizedName().substring(5));
		
		// Ресепты
		GameRegistry.addRecipe(new ItemStack(strangepickaxe),
				new Object[] { "SSS", " I ", " I ", 'S', strangeshard, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(strangeaxe),
				new Object[] { "SS ", "SI ", " I ", 'S', strangeshard, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(strangehoe),
				new Object[] { "SS ", " I ", " I ", 'S', strangeshard, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(strangesword),
				new Object[] { " S ", " S ", " I ", 'S', strangeshard, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(strangeshovel),
				new Object[] { " S ", " I ", " I ", 'S', strangeshard, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(strangehoe),
				new Object[] { " SS", " I ", " I ", 'S', strangeshard, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(strangehelmet), new Object[] { "SSS", "S S", "   ", 'S', strangeshard });
		GameRegistry.addRecipe(new ItemStack(strangechestplate),
				new Object[] { "S S", "SSS", "SSS", 'S', strangeshard });
		GameRegistry.addRecipe(new ItemStack(strangeleggings), new Object[] { "SSS", "S S", "S S", 'S', strangeshard });
		GameRegistry.addRecipe(new ItemStack(strangeboots), new Object[] { "   ", "S S", "S S", 'S', strangeshard });
		//Генерация мира
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
		//Печка
		energizer = new Energizer(Material.rock);
		GameRegistry.registerBlock(energizer, "Energizer");
		//energizeractive =  new Energizer(true).setBlockName("EnergizerActive").setCreativeTab(tabPegasus);
		
	
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {

	}

	public static CreativeTabs tabPegasus = new CreativeTabs("PegasusTechnoMod") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(strangeshard).getItem();
		}
	};
}
