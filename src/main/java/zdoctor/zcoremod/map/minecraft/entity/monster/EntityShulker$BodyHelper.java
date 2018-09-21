package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShulker$BodyHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$b";
		else
			return "net/minecraft/entity/monster/EntityShulker$BodyHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$b";
		else
			return "EntityShulker$BodyHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladi$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityShulker$BodyHelper;";
	}

	/**
	 * <p>
	 * Name: updateRenderAngles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75664_a = McMappingDatabase.getSRG("EntityShulker$BodyHelper.func_75664_a");

}
