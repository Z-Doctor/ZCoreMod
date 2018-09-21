package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAINearestAttackableTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yw";
		else
			return "net/minecraft/entity/ai/EntityAINearestAttackableTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yw";
		else
			return "EntityAINearestAttackableTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyw;";
		else
			return "Lnet/minecraft/entity/ai/EntityAINearestAttackableTarget;";
	}

	/**
	 * <p>
	 * Name: targetEntity
	 * </p>
	 */
	public static McObfPair field_75309_a = McMappingDatabase.getSRG("field_75309_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAINearestAttackableTarget.func_75250_a");

	/**
	 * <p>
	 * Name: getTargetableArea
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_188511_a = McMappingDatabase.getSRG("EntityAINearestAttackableTarget.func_188511_a");

	/**
	 * <p>
	 * Name: targetEntitySelector
	 * </p>
	 */
	public static McObfPair field_82643_g = McMappingDatabase.getSRG("field_82643_g");

	/**
	 * <p>
	 * Name: targetClass
	 * </p>
	 */
	public static McObfPair field_75307_b = McMappingDatabase.getSRG("field_75307_b");

	/**
	 * <p>
	 * Name: targetChance
	 * </p>
	 */
	public static McObfPair field_75308_c = McMappingDatabase.getSRG("field_75308_c");

	/**
	 * <p>
	 * Name: sorter
	 * </p>
	 */
	public static McObfPair field_75306_g = McMappingDatabase.getSRG("field_75306_g");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAINearestAttackableTarget.func_75249_e");

}
