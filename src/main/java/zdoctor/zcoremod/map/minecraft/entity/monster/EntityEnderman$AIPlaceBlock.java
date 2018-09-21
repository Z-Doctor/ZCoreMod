package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderman$AIPlaceBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$a";
		else
			return "net/minecraft/entity/monster/EntityEnderman$AIPlaceBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$a";
		else
			return "EntityEnderman$AIPlaceBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacu$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityEnderman$AIPlaceBlock;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityEnderman$AIPlaceBlock.func_75250_a");

	/**
	 * <p>
	 * Name: canPlaceBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_188518_a = McMappingDatabase.getSRG("EntityEnderman$AIPlaceBlock.func_188518_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityEnderman$AIPlaceBlock.func_75246_d");

	/**
	 * <p>
	 * Name: enderman
	 * </p>
	 */
	public static McObfPair field_179475_a = McMappingDatabase.getSRG("field_179475_a");

}
