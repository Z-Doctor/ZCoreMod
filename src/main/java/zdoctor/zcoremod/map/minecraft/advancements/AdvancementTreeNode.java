package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementTreeNode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "t";
		else
			return "net/minecraft/advancements/AdvancementTreeNode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "t";
		else
			return "AdvancementTreeNode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lt;";
		else
			return "Lnet/minecraft/advancements/AdvancementTreeNode;";
	}

	/**
	 * <p>
	 * Name: buildSubTree
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Lnet/minecraft/advancements/AdvancementTreeNode;)Lnet/minecraft/advancements/AdvancementTreeNode;]
	 * </p>
	 */
	public static McObfPair func_192322_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192322_a");

	/**
	 * <p>
	 * Name: mod
	 * </p>
	 */
	public static McObfPair field_192337_j = McMappingDatabase.getSRG("field_192337_j");

	/**
	 * <p>
	 * Name: layout
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_192323_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192323_a");

	/**
	 * <p>
	 * Name: firstWalk
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192320_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192320_a");

	/**
	 * <p>
	 * Name: executeShifts
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192325_b = McMappingDatabase.getSRG("AdvancementTreeNode.func_192325_b");

	/**
	 * <p>
	 * Name: secondWalk
	 * </p>
	 * <p>
	 * Desc: [(FIF)F]
	 * </p>
	 */
	public static McObfPair func_192319_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192319_a");

	/**
	 * <p>
	 * Name: getFirstChild
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/AdvancementTreeNode;]
	 * </p>
	 */
	public static McObfPair func_192321_c = McMappingDatabase.getSRG("AdvancementTreeNode.func_192321_c");

	/**
	 * <p>
	 * Name: advancement
	 * </p>
	 */
	public static McObfPair field_192328_a = McMappingDatabase.getSRG("field_192328_a");

	/**
	 * <p>
	 * Name: moveSubtree
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/AdvancementTreeNode;F)V]
	 * </p>
	 */
	public static McObfPair func_192316_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192316_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_192335_h = McMappingDatabase.getSRG("field_192335_h");

	/**
	 * <p>
	 * Name: getAncestor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/AdvancementTreeNode;Lnet/minecraft/advancements/AdvancementTreeNode;)Lnet/minecraft/advancements/AdvancementTreeNode;]
	 * </p>
	 */
	public static McObfPair func_192326_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192326_a");

	/**
	 * <p>
	 * Name: children
	 * </p>
	 */
	public static McObfPair field_192332_e = McMappingDatabase.getSRG("field_192332_e");

	/**
	 * <p>
	 * Name: apportion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/AdvancementTreeNode;)Lnet/minecraft/advancements/AdvancementTreeNode;]
	 * </p>
	 */
	public static McObfPair func_192324_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192324_a");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_192329_b = McMappingDatabase.getSRG("field_192329_b");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_192336_i = McMappingDatabase.getSRG("field_192336_i");

	/**
	 * <p>
	 * Name: thread
	 * </p>
	 */
	public static McObfPair field_192334_g = McMappingDatabase.getSRG("field_192334_g");

	/**
	 * <p>
	 * Name: sibling
	 * </p>
	 */
	public static McObfPair field_192330_c = McMappingDatabase.getSRG("field_192330_c");

	/**
	 * <p>
	 * Name: shift
	 * </p>
	 */
	public static McObfPair field_192339_l = McMappingDatabase.getSRG("field_192339_l");

	/**
	 * <p>
	 * Name: ancestor
	 * </p>
	 */
	public static McObfPair field_192333_f = McMappingDatabase.getSRG("field_192333_f");

	/**
	 * <p>
	 * Name: getLastChild
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/AdvancementTreeNode;]
	 * </p>
	 */
	public static McObfPair func_192317_d = McMappingDatabase.getSRG("AdvancementTreeNode.func_192317_d");

	/**
	 * <p>
	 * Name: thirdWalk
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_192318_a = McMappingDatabase.getSRG("AdvancementTreeNode.func_192318_a");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192327_e = McMappingDatabase.getSRG("AdvancementTreeNode.func_192327_e");

	/**
	 * <p>
	 * Name: change
	 * </p>
	 */
	public static McObfPair field_192338_k = McMappingDatabase.getSRG("field_192338_k");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_192331_d = McMappingDatabase.getSRG("field_192331_d");

}
