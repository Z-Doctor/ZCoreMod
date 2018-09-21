package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$FirstFloor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$a";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$FirstFloor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$a";
		else
			return "WoodlandMansionPieces$FirstFloor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$a;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$FirstFloor;";
	}

	/**
	 * <p>
	 * Name: get1x1
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191104_a = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191104_a");

	/**
	 * <p>
	 * Name: get1x1Secret
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191099_b = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191099_b");

	/**
	 * <p>
	 * Name: get2x2
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191101_d = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191101_d");

	/**
	 * <p>
	 * Name: get2x2Secret
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191103_e = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191103_e");

	/**
	 * <p>
	 * Name: get1x2SideEntrance
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191100_a = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191100_a");

	/**
	 * <p>
	 * Name: get1x2FrontEntrance
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191098_b = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191098_b");

	/**
	 * <p>
	 * Name: get1x2Secret
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191102_c = McMappingDatabase.getSRG("WoodlandMansionPieces$FirstFloor.func_191102_c");

}
