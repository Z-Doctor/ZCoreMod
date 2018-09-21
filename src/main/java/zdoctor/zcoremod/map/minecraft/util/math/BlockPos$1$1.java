package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPos$1$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$1$1";
		else
			return "net/minecraft/util/math/BlockPos$1$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$1$1";
		else
			return "BlockPos$1$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Let$1$1;";
		else
			return "Lnet/minecraft/util/math/BlockPos$1$1;";
	}

	/**
	 * <p>
	 * Name: lastPosY
	 * </p>
	 */
	public static McObfPair field_191536_d = McMappingDatabase.getSRG("field_191536_d");

	/**
	 * <p>
	 * Name: lastPosX
	 * </p>
	 */
	public static McObfPair field_191535_c = McMappingDatabase.getSRG("field_191535_c");

	/**
	 * <p>
	 * Name: lastPosZ
	 * </p>
	 */
	public static McObfPair field_191537_e = McMappingDatabase.getSRG("field_191537_e");

	/**
	 * <p>
	 * Name: first
	 * </p>
	 */
	public static McObfPair field_191534_b = McMappingDatabase.getSRG("field_191534_b");

}
