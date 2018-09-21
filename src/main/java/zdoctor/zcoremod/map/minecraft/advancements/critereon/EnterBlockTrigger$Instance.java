package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnterBlockTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ah$b";
		else
			return "net/minecraft/advancements/critereon/EnterBlockTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ah$b";
		else
			return "EnterBlockTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lah$b;";
		else
			return "Lnet/minecraft/advancements/critereon/EnterBlockTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_192261_a = McMappingDatabase.getSRG("field_192261_a");

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_192262_b = McMappingDatabase.getSRG("field_192262_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_192260_a = McMappingDatabase.getSRG("EnterBlockTrigger$Instance.func_192260_a");

}
