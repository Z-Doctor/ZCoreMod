package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EffectsChangedTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ae$b";
		else
			return "net/minecraft/advancements/critereon/EffectsChangedTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ae$b";
		else
			return "EffectsChangedTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lae$b;";
		else
			return "Lnet/minecraft/advancements/critereon/EffectsChangedTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: effects
	 * </p>
	 */
	public static McObfPair field_193196_a = McMappingDatabase.getSRG("field_193196_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_193195_a = McMappingDatabase.getSRG("EffectsChangedTrigger$Instance.func_193195_a");

}
