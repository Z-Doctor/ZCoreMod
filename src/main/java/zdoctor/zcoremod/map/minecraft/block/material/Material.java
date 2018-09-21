package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Material {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcz";
		else
			return "net/minecraft/block/material/Material";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcz";
		else
			return "Material";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcz;";
		else
			return "Lnet/minecraft/block/material/Material;";
	}

	/**
	 * <p>
	 * Name: setRequiresTool
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_76221_f = McMappingDatabase.getSRG("Material.func_76221_f");

	/**
	 * <p>
	 * Name: SPONGE
	 * </p>
	 */
	public static McObfPair field_151583_m = McMappingDatabase.getSRG("field_151583_m");

	/**
	 * <p>
	 * Name: setTranslucent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_76223_p = McMappingDatabase.getSRG("Material.func_76223_p");

	/**
	 * <p>
	 * Name: canBurn
	 * </p>
	 */
	public static McObfPair field_76235_G = McMappingDatabase.getSRG("field_76235_G");

	/**
	 * <p>
	 * Name: GLASS
	 * </p>
	 */
	public static McObfPair field_151592_s = McMappingDatabase.getSRG("field_151592_s");

	/**
	 * <p>
	 * Name: CIRCUITS
	 * </p>
	 */
	public static McObfPair field_151594_q = McMappingDatabase.getSRG("field_151594_q");

	/**
	 * <p>
	 * Name: SAND
	 * </p>
	 */
	public static McObfPair field_151595_p = McMappingDatabase.getSRG("field_151595_p");

	/**
	 * <p>
	 * Name: GRASS
	 * </p>
	 */
	public static McObfPair field_151577_b = McMappingDatabase.getSRG("field_151577_b");

	/**
	 * <p>
	 * Name: mobilityFlag
	 * </p>
	 */
	public static McObfPair field_76242_K = McMappingDatabase.getSRG("field_76242_K");

	/**
	 * <p>
	 * Name: getCanBurn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76217_h = McMappingDatabase.getSRG("Material.func_76217_h");

	/**
	 * <p>
	 * Name: CLOTH
	 * </p>
	 */
	public static McObfPair field_151580_n = McMappingDatabase.getSRG("field_151580_n");

	/**
	 * <p>
	 * Name: setReplaceable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_76231_i = McMappingDatabase.getSRG("Material.func_76231_i");

	/**
	 * <p>
	 * Name: isTranslucent
	 * </p>
	 */
	public static McObfPair field_76240_I = McMappingDatabase.getSRG("field_76240_I");

	/**
	 * <p>
	 * Name: BARRIER
	 * </p>
	 */
	public static McObfPair field_175972_I = McMappingDatabase.getSRG("field_175972_I");

	/**
	 * <p>
	 * Name: isToolNotRequired
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76229_l = McMappingDatabase.getSRG("Material.func_76229_l");

	/**
	 * <p>
	 * Name: CORAL
	 * </p>
	 */
	public static McObfPair field_151589_v = McMappingDatabase.getSRG("field_151589_v");

	/**
	 * <p>
	 * Name: requiresNoTool
	 * </p>
	 */
	public static McObfPair field_76241_J = McMappingDatabase.getSRG("field_76241_J");

	/**
	 * <p>
	 * Name: CLAY
	 * </p>
	 */
	public static McObfPair field_151571_B = McMappingDatabase.getSRG("field_151571_B");

	/**
	 * <p>
	 * Name: REDSTONE_LIGHT
	 * </p>
	 */
	public static McObfPair field_151591_t = McMappingDatabase.getSRG("field_151591_t");

	/**
	 * <p>
	 * Name: materialMapColor
	 * </p>
	 */
	public static McObfPair field_76234_F = McMappingDatabase.getSRG("field_76234_F");

	/**
	 * <p>
	 * Name: VINE
	 * </p>
	 */
	public static McObfPair field_151582_l = McMappingDatabase.getSRG("field_151582_l");

	/**
	 * <p>
	 * Name: WEB
	 * </p>
	 */
	public static McObfPair field_151569_G = McMappingDatabase.getSRG("field_151569_G");

	/**
	 * <p>
	 * Name: PLANTS
	 * </p>
	 */
	public static McObfPair field_151585_k = McMappingDatabase.getSRG("field_151585_k");

	/**
	 * <p>
	 * Name: isLiquid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76224_d = McMappingDatabase.getSRG("Material.func_76224_d");

	/**
	 * <p>
	 * Name: isSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76220_a = McMappingDatabase.getSRG("Material.func_76220_a");

	/**
	 * <p>
	 * Name: LAVA
	 * </p>
	 */
	public static McObfPair field_151587_i = McMappingDatabase.getSRG("field_151587_i");

	/**
	 * <p>
	 * Name: setBurning
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_76226_g = McMappingDatabase.getSRG("Material.func_76226_g");

	/**
	 * <p>
	 * Name: PISTON
	 * </p>
	 */
	public static McObfPair field_76233_E = McMappingDatabase.getSRG("field_76233_E");

	/**
	 * <p>
	 * Name: ROCK
	 * </p>
	 */
	public static McObfPair field_151576_e = McMappingDatabase.getSRG("field_151576_e");

	/**
	 * <p>
	 * Name: PORTAL
	 * </p>
	 */
	public static McObfPair field_151567_E = McMappingDatabase.getSRG("field_151567_E");

	/**
	 * <p>
	 * Name: replaceable
	 * </p>
	 */
	public static McObfPair field_76239_H = McMappingDatabase.getSRG("field_76239_H");

	/**
	 * <p>
	 * Name: STRUCTURE_VOID
	 * </p>
	 */
	public static McObfPair field_189963_J = McMappingDatabase.getSRG("field_189963_J");

	/**
	 * <p>
	 * Name: CRAFTED_SNOW
	 * </p>
	 */
	public static McObfPair field_151596_z = McMappingDatabase.getSRG("field_151596_z");

	/**
	 * <p>
	 * Name: setAdventureModeExempt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_85158_p = McMappingDatabase.getSRG("Material.func_85158_p");

	/**
	 * <p>
	 * Name: getMobilityFlag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_186274_m = McMappingDatabase.getSRG("Material.func_186274_m");

	/**
	 * <p>
	 * Name: setNoPushMobility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_76219_n = McMappingDatabase.getSRG("Material.func_76219_n");

	/**
	 * <p>
	 * Name: FIRE
	 * </p>
	 */
	public static McObfPair field_151581_o = McMappingDatabase.getSRG("field_151581_o");

	/**
	 * <p>
	 * Name: WOOD
	 * </p>
	 */
	public static McObfPair field_151575_d = McMappingDatabase.getSRG("field_151575_d");

	/**
	 * <p>
	 * Name: IRON
	 * </p>
	 */
	public static McObfPair field_151573_f = McMappingDatabase.getSRG("field_151573_f");

	/**
	 * <p>
	 * Name: DRAGON_EGG
	 * </p>
	 */
	public static McObfPair field_151566_D = McMappingDatabase.getSRG("field_151566_D");

	/**
	 * <p>
	 * Name: CARPET
	 * </p>
	 */
	public static McObfPair field_151593_r = McMappingDatabase.getSRG("field_151593_r");

	/**
	 * <p>
	 * Name: getMaterialMapColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_151565_r = McMappingDatabase.getSRG("Material.func_151565_r");

	/**
	 * <p>
	 * Name: isOpaque
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76218_k = McMappingDatabase.getSRG("Material.func_76218_k");

	/**
	 * <p>
	 * Name: isReplaceable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76222_j = McMappingDatabase.getSRG("Material.func_76222_j");

	/**
	 * <p>
	 * Name: GOURD
	 * </p>
	 */
	public static McObfPair field_151572_C = McMappingDatabase.getSRG("field_151572_C");

	/**
	 * <p>
	 * Name: isAdventureModeExempt
	 * </p>
	 */
	public static McObfPair field_85159_M = McMappingDatabase.getSRG("field_85159_M");

	/**
	 * <p>
	 * Name: setImmovableMobility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_76225_o = McMappingDatabase.getSRG("Material.func_76225_o");

	/**
	 * <p>
	 * Name: GROUND
	 * </p>
	 */
	public static McObfPair field_151578_c = McMappingDatabase.getSRG("field_151578_c");

	/**
	 * <p>
	 * Name: WATER
	 * </p>
	 */
	public static McObfPair field_151586_h = McMappingDatabase.getSRG("field_151586_h");

	/**
	 * <p>
	 * Name: CACTUS
	 * </p>
	 */
	public static McObfPair field_151570_A = McMappingDatabase.getSRG("field_151570_A");

	/**
	 * <p>
	 * Name: TNT
	 * </p>
	 */
	public static McObfPair field_151590_u = McMappingDatabase.getSRG("field_151590_u");

	/**
	 * <p>
	 * Name: CAKE
	 * </p>
	 */
	public static McObfPair field_151568_F = McMappingDatabase.getSRG("field_151568_F");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_151579_a = McMappingDatabase.getSRG("field_151579_a");

	/**
	 * <p>
	 * Name: ICE
	 * </p>
	 */
	public static McObfPair field_151588_w = McMappingDatabase.getSRG("field_151588_w");

	/**
	 * <p>
	 * Name: ANVIL
	 * </p>
	 */
	public static McObfPair field_151574_g = McMappingDatabase.getSRG("field_151574_g");

	/**
	 * <p>
	 * Name: SNOW
	 * </p>
	 */
	public static McObfPair field_151597_y = McMappingDatabase.getSRG("field_151597_y");

	/**
	 * <p>
	 * Name: LEAVES
	 * </p>
	 */
	public static McObfPair field_151584_j = McMappingDatabase.getSRG("field_151584_j");

	/**
	 * <p>
	 * Name: PACKED_ICE
	 * </p>
	 */
	public static McObfPair field_151598_x = McMappingDatabase.getSRG("field_151598_x");

	/**
	 * <p>
	 * Name: blocksLight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76228_b = McMappingDatabase.getSRG("Material.func_76228_b");

	/**
	 * <p>
	 * Name: blocksMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76230_c = McMappingDatabase.getSRG("Material.func_76230_c");

}
