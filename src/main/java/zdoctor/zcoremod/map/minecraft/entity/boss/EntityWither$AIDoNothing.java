package zdoctor.zcoremod.map.minecraft.entity.boss;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWither$AIDoNothing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abx$a";
		else
			return "net/minecraft/entity/boss/EntityWither$AIDoNothing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abx$a";
		else
			return "EntityWither$AIDoNothing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labx$a;";
		else
			return "Lnet/minecraft/entity/boss/EntityWither$AIDoNothing;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityWither$AIDoNothing.func_75250_a");

}
