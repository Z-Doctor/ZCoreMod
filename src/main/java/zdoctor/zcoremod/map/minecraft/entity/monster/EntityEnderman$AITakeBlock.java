package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderman$AITakeBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$c";
		else
			return "net/minecraft/entity/monster/EntityEnderman$AITakeBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$c";
		else
			return "EntityEnderman$AITakeBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacu$c;";
		else
			return "Lnet/minecraft/entity/monster/EntityEnderman$AITakeBlock;";
	}

	/**
	 * <p>
	 * Name: enderman
	 * </p>
	 */
	public static McObfPair field_179473_a = McMappingDatabase.getSRG("field_179473_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityEnderman$AITakeBlock.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityEnderman$AITakeBlock.func_75250_a");

}
