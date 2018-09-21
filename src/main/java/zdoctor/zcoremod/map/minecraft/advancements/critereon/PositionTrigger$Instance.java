package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PositionTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ar$b";
		else
			return "net/minecraft/advancements/critereon/PositionTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ar$b";
		else
			return "PositionTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lar$b;";
		else
			return "Lnet/minecraft/advancements/critereon/PositionTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_193204_a = McMappingDatabase.getSRG("PositionTrigger$Instance.func_193204_a");

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_193205_a = McMappingDatabase.getSRG("field_193205_a");

}
