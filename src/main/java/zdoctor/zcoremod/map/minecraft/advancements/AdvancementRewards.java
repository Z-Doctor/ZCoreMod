package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementRewards {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "l";
		else
			return "net/minecraft/advancements/AdvancementRewards";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "l";
		else
			return "AdvancementRewards";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ll;";
		else
			return "Lnet/minecraft/advancements/AdvancementRewards;";
	}

	/**
	 * <p>
	 * Name: function
	 * </p>
	 */
	public static McObfPair field_193129_e = McMappingDatabase.getSRG("field_193129_e");

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_192114_a = McMappingDatabase.getSRG("field_192114_a");

	/**
	 * <p>
	 * Name: experience
	 * </p>
	 */
	public static McObfPair field_192115_b = McMappingDatabase.getSRG("field_192115_b");

	/**
	 * <p>
	 * Name: loot
	 * </p>
	 */
	public static McObfPair field_192116_c = McMappingDatabase.getSRG("field_192116_c");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_192113_a = McMappingDatabase.getSRG("AdvancementRewards.func_192113_a");

	/**
	 * <p>
	 * Name: recipes
	 * </p>
	 */
	public static McObfPair field_192117_d = McMappingDatabase.getSRG("field_192117_d");

}
