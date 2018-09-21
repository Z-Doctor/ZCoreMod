package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGhast$AILookAround {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$a";
		else
			return "net/minecraft/entity/monster/EntityGhast$AILookAround";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$a";
		else
			return "EntityGhast$AILookAround";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacy$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityGhast$AILookAround;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityGhast$AILookAround.func_75246_d");

	/**
	 * <p>
	 * Name: parentEntity
	 * </p>
	 */
	public static McObfPair field_179472_a = McMappingDatabase.getSRG("field_179472_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityGhast$AILookAround.func_75250_a");

}
