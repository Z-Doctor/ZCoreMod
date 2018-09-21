package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIPanic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xy";
		else
			return "net/minecraft/entity/ai/EntityAIPanic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xy";
		else
			return "EntityAIPanic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxy;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIPanic;";
	}

	/**
	 * <p>
	 * Name: randPosZ
	 * </p>
	 */
	public static McObfPair field_75264_e = McMappingDatabase.getSRG("field_75264_e");

	/**
	 * <p>
	 * Name: findRandomPosition
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190863_f = McMappingDatabase.getSRG("EntityAIPanic.func_190863_f");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIPanic.func_75253_b");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75265_b = McMappingDatabase.getSRG("field_75265_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIPanic.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIPanic.func_75249_e");

	/**
	 * <p>
	 * Name: randPosX
	 * </p>
	 */
	public static McObfPair field_75266_c = McMappingDatabase.getSRG("field_75266_c");

	/**
	 * <p>
	 * Name: creature
	 * </p>
	 */
	public static McObfPair field_75267_a = McMappingDatabase.getSRG("field_75267_a");

	/**
	 * <p>
	 * Name: randPosY
	 * </p>
	 */
	public static McObfPair field_75263_d = McMappingDatabase.getSRG("field_75263_d");

	/**
	 * <p>
	 * Name: getRandPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;II)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_188497_a = McMappingDatabase.getSRG("EntityAIPanic.func_188497_a");

}
