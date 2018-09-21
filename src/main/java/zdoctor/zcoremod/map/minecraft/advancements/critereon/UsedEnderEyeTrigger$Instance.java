package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UsedEnderEyeTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bd$b";
		else
			return "net/minecraft/advancements/critereon/UsedEnderEyeTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bd$b";
		else
			return "UsedEnderEyeTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbd$b;";
		else
			return "Lnet/minecraft/advancements/critereon/UsedEnderEyeTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_192289_a = McMappingDatabase.getSRG("field_192289_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_192288_a = McMappingDatabase.getSRG("UsedEnderEyeTrigger$Instance.func_192288_a");

}
