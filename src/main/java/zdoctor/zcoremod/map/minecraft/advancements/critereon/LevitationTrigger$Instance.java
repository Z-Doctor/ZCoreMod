package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LevitationTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ap$b";
		else
			return "net/minecraft/advancements/critereon/LevitationTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ap$b";
		else
			return "LevitationTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lap$b;";
		else
			return "Lnet/minecraft/advancements/critereon/LevitationTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_193203_b = McMappingDatabase.getSRG("field_193203_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/util/math/Vec3d;I)Z]
	 * </p>
	 */
	public static McObfPair func_193201_a = McMappingDatabase.getSRG("LevitationTrigger$Instance.func_193201_a");

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_193202_a = McMappingDatabase.getSRG("field_193202_a");

}
