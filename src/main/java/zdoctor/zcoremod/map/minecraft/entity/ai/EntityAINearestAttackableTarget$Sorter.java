package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAINearestAttackableTarget$Sorter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yw$a";
		else
			return "net/minecraft/entity/ai/EntityAINearestAttackableTarget$Sorter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yw$a";
		else
			return "EntityAINearestAttackableTarget$Sorter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyw$a;";
		else
			return "Lnet/minecraft/entity/ai/EntityAINearestAttackableTarget$Sorter;";
	}

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75459_b = McMappingDatabase.getSRG("field_75459_b");

}
