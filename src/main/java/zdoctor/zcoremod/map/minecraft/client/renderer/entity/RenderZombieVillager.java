package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderZombieVillager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbo";
		else
			return "net/minecraft/client/renderer/entity/RenderZombieVillager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbo";
		else
			return "RenderZombieVillager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbo;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderZombieVillager;";
	}

	/**
	 * <p>
	 * Name: ZOMBIE_VILLAGER_FARMER_LOCATION
	 * </p>
	 */
	public static McObfPair field_188330_l = McMappingDatabase.getSRG("field_188330_l");

	/**
	 * <p>
	 * Name: ZOMBIE_VILLAGER_SMITH_LOCATION
	 * </p>
	 */
	public static McObfPair field_188333_o = McMappingDatabase.getSRG("field_188333_o");

	/**
	 * <p>
	 * Name: ZOMBIE_VILLAGER_BUTCHER_LOCATION
	 * </p>
	 */
	public static McObfPair field_188329_p = McMappingDatabase.getSRG("field_188329_p");

	/**
	 * <p>
	 * Name: ZOMBIE_VILLAGER_PRIEST_LOCATION
	 * </p>
	 */
	public static McObfPair field_188332_n = McMappingDatabase.getSRG("field_188332_n");

	/**
	 * <p>
	 * Name: ZOMBIE_VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110864_q = McMappingDatabase.getSRG("field_110864_q");

	/**
	 * <p>
	 * Name: ZOMBIE_VILLAGER_LIBRARIAN_LOC
	 * </p>
	 */
	public static McObfPair field_188331_m = McMappingDatabase.getSRG("field_188331_m");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityZombieVillager;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderZombieVillager.func_110775_a");

	/**
	 * <p>
	 * Name: applyRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityZombieVillager;FFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_77043_a = McMappingDatabase.getSRG("RenderZombieVillager.func_77043_a");

}
