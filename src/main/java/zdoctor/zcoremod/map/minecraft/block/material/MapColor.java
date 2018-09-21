package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapColor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bda";
		else
			return "net/minecraft/block/material/MapColor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bda";
		else
			return "MapColor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbda;";
		else
			return "Lnet/minecraft/block/material/MapColor;";
	}

	/**
	 * <p>
	 * Name: ICE
	 * </p>
	 */
	public static McObfPair field_151657_g = McMappingDatabase.getSRG("field_151657_g");

	/**
	 * <p>
	 * Name: GRASS
	 * </p>
	 */
	public static McObfPair field_151661_c = McMappingDatabase.getSRG("field_151661_c");

	/**
	 * <p>
	 * Name: IRON
	 * </p>
	 */
	public static McObfPair field_151668_h = McMappingDatabase.getSRG("field_151668_h");

	/**
	 * <p>
	 * Name: DIAMOND
	 * </p>
	 */
	public static McObfPair field_151648_G = McMappingDatabase.getSRG("field_151648_G");

	/**
	 * <p>
	 * Name: SAND
	 * </p>
	 */
	public static McObfPair field_151658_d = McMappingDatabase.getSRG("field_151658_d");

	/**
	 * <p>
	 * Name: RED_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193559_aa = McMappingDatabase.getSRG("field_193559_aa");

	/**
	 * <p>
	 * Name: RED
	 * </p>
	 */
	public static McObfPair field_151645_D = McMappingDatabase.getSRG("field_151645_D");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_151643_b = McMappingDatabase.getSRG("MapColor.func_151643_b");

	/**
	 * <p>
	 * Name: GREEN_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193574_Z = McMappingDatabase.getSRG("field_193574_Z");

	/**
	 * <p>
	 * Name: PINK
	 * </p>
	 */
	public static McObfPair field_151671_v = McMappingDatabase.getSRG("field_151671_v");

	/**
	 * <p>
	 * Name: DIRT
	 * </p>
	 */
	public static McObfPair field_151664_l = McMappingDatabase.getSRG("field_151664_l");

	/**
	 * <p>
	 * Name: WOOD
	 * </p>
	 */
	public static McObfPair field_151663_o = McMappingDatabase.getSRG("field_151663_o");

	/**
	 * <p>
	 * Name: colorValue
	 * </p>
	 */
	public static McObfPair field_76291_p = McMappingDatabase.getSRG("field_76291_p");

	/**
	 * <p>
	 * Name: GOLD
	 * </p>
	 */
	public static McObfPair field_151647_F = McMappingDatabase.getSRG("field_151647_F");

	/**
	 * <p>
	 * Name: COLORS
	 * </p>
	 */
	public static McObfPair field_76281_a = McMappingDatabase.getSRG("field_76281_a");

	/**
	 * <p>
	 * Name: BLUE
	 * </p>
	 */
	public static McObfPair field_151649_A = McMappingDatabase.getSRG("field_151649_A");

	/**
	 * <p>
	 * Name: GRAY_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193568_T = McMappingDatabase.getSRG("field_193568_T");

	/**
	 * <p>
	 * Name: CLAY
	 * </p>
	 */
	public static McObfPair field_151667_k = McMappingDatabase.getSRG("field_151667_k");

	/**
	 * <p>
	 * Name: EMERALD
	 * </p>
	 */
	public static McObfPair field_151653_I = McMappingDatabase.getSRG("field_151653_I");

	/**
	 * <p>
	 * Name: CLOTH
	 * </p>
	 */
	public static McObfPair field_151659_e = McMappingDatabase.getSRG("field_151659_e");

	/**
	 * <p>
	 * Name: LIGHT_BLUE
	 * </p>
	 */
	public static McObfPair field_151674_s = McMappingDatabase.getSRG("field_151674_s");

	/**
	 * <p>
	 * Name: OBSIDIAN
	 * </p>
	 */
	public static McObfPair field_151654_J = McMappingDatabase.getSRG("field_151654_J");

	/**
	 * <p>
	 * Name: QUARTZ
	 * </p>
	 */
	public static McObfPair field_151677_p = McMappingDatabase.getSRG("field_151677_p");

	/**
	 * <p>
	 * Name: MAGENTA_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193563_O = McMappingDatabase.getSRG("field_193563_O");

	/**
	 * <p>
	 * Name: LIME
	 * </p>
	 */
	public static McObfPair field_151672_u = McMappingDatabase.getSRG("field_151672_u");

	/**
	 * <p>
	 * Name: BLUE_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193572_X = McMappingDatabase.getSRG("field_193572_X");

	/**
	 * <p>
	 * Name: MAGENTA
	 * </p>
	 */
	public static McObfPair field_151675_r = McMappingDatabase.getSRG("field_151675_r");

	/**
	 * <p>
	 * Name: colorIndex
	 * </p>
	 */
	public static McObfPair field_76290_q = McMappingDatabase.getSRG("field_76290_q");

	/**
	 * <p>
	 * Name: CYAN_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193570_V = McMappingDatabase.getSRG("field_193570_V");

	/**
	 * <p>
	 * Name: GREEN
	 * </p>
	 */
	public static McObfPair field_151651_C = McMappingDatabase.getSRG("field_151651_C");

	/**
	 * <p>
	 * Name: WATER
	 * </p>
	 */
	public static McObfPair field_151662_n = McMappingDatabase.getSRG("field_151662_n");

	/**
	 * <p>
	 * Name: BLOCK_COLORS
	 * </p>
	 */
	public static McObfPair field_193575_b = McMappingDatabase.getSRG("field_193575_b");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_151660_b = McMappingDatabase.getSRG("field_151660_b");

	/**
	 * <p>
	 * Name: YELLOW_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193565_Q = McMappingDatabase.getSRG("field_193565_Q");

	/**
	 * <p>
	 * Name: PURPLE_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193571_W = McMappingDatabase.getSRG("field_193571_W");

	/**
	 * <p>
	 * Name: SILVER_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193569_U = McMappingDatabase.getSRG("field_193569_U");

	/**
	 * <p>
	 * Name: LAPIS
	 * </p>
	 */
	public static McObfPair field_151652_H = McMappingDatabase.getSRG("field_151652_H");

	/**
	 * <p>
	 * Name: CYAN
	 * </p>
	 */
	public static McObfPair field_151679_y = McMappingDatabase.getSRG("field_151679_y");

	/**
	 * <p>
	 * Name: TNT
	 * </p>
	 */
	public static McObfPair field_151656_f = McMappingDatabase.getSRG("field_151656_f");

	/**
	 * <p>
	 * Name: BROWN
	 * </p>
	 */
	public static McObfPair field_151650_B = McMappingDatabase.getSRG("field_151650_B");

	/**
	 * <p>
	 * Name: GRAY
	 * </p>
	 */
	public static McObfPair field_151670_w = McMappingDatabase.getSRG("field_151670_w");

	/**
	 * <p>
	 * Name: STONE
	 * </p>
	 */
	public static McObfPair field_151665_m = McMappingDatabase.getSRG("field_151665_m");

	/**
	 * <p>
	 * Name: FOLIAGE
	 * </p>
	 */
	public static McObfPair field_151669_i = McMappingDatabase.getSRG("field_151669_i");

	/**
	 * <p>
	 * Name: PINK_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193567_S = McMappingDatabase.getSRG("field_193567_S");

	/**
	 * <p>
	 * Name: SILVER
	 * </p>
	 */
	public static McObfPair field_151680_x = McMappingDatabase.getSRG("field_151680_x");

	/**
	 * <p>
	 * Name: BROWN_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193573_Y = McMappingDatabase.getSRG("field_193573_Y");

	/**
	 * <p>
	 * Name: WHITE_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193561_M = McMappingDatabase.getSRG("field_193561_M");

	/**
	 * <p>
	 * Name: BLACK
	 * </p>
	 */
	public static McObfPair field_151646_E = McMappingDatabase.getSRG("field_151646_E");

	/**
	 * <p>
	 * Name: BLACK_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193560_ab = McMappingDatabase.getSRG("field_193560_ab");

	/**
	 * <p>
	 * Name: LIGHT_BLUE_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193564_P = McMappingDatabase.getSRG("field_193564_P");

	/**
	 * <p>
	 * Name: ORANGE_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193562_N = McMappingDatabase.getSRG("field_193562_N");

	/**
	 * <p>
	 * Name: SNOW
	 * </p>
	 */
	public static McObfPair field_151666_j = McMappingDatabase.getSRG("field_151666_j");

	/**
	 * <p>
	 * Name: LIME_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_193566_R = McMappingDatabase.getSRG("field_193566_R");

	/**
	 * <p>
	 * Name: ADOBE
	 * </p>
	 */
	public static McObfPair field_151676_q = McMappingDatabase.getSRG("field_151676_q");

	/**
	 * <p>
	 * Name: YELLOW
	 * </p>
	 */
	public static McObfPair field_151673_t = McMappingDatabase.getSRG("field_151673_t");

	/**
	 * <p>
	 * Name: NETHERRACK
	 * </p>
	 */
	public static McObfPair field_151655_K = McMappingDatabase.getSRG("field_151655_K");

	/**
	 * <p>
	 * Name: getBlockColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_193558_a = McMappingDatabase.getSRG("MapColor.func_193558_a");

	/**
	 * <p>
	 * Name: PURPLE
	 * </p>
	 */
	public static McObfPair field_151678_z = McMappingDatabase.getSRG("field_151678_z");

}
