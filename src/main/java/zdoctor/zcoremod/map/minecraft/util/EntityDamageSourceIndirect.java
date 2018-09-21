package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityDamageSourceIndirect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ut";
		else
			return "net/minecraft/util/EntityDamageSourceIndirect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ut";
		else
			return "EntityDamageSourceIndirect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lut;";
		else
			return "Lnet/minecraft/util/EntityDamageSourceIndirect;";
	}

	/**
	 * <p>
	 * Name: indirectEntity
	 * </p>
	 */
	public static McObfPair field_76387_p = McMappingDatabase.getSRG("field_76387_p");

	/**
	 * <p>
	 * Name: getDeathMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151519_b = McMappingDatabase.getSRG("EntityDamageSourceIndirect.func_151519_b");

	/**
	 * <p>
	 * Name: getTrueSource
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_76346_g = McMappingDatabase.getSRG("EntityDamageSourceIndirect.func_76346_g");

	/**
	 * <p>
	 * Name: getImmediateSource
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_76364_f = McMappingDatabase.getSRG("EntityDamageSourceIndirect.func_76364_f");

}
