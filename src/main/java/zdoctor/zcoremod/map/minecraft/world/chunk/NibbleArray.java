package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NibbleArray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axs";
		else
			return "net/minecraft/world/chunk/NibbleArray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axs";
		else
			return "NibbleArray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxs;";
		else
			return "Lnet/minecraft/world/chunk/NibbleArray;";
	}

	/**
	 * <p>
	 * Name: getData
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_177481_a = McMappingDatabase.getSRG("NibbleArray.func_177481_a");

	/**
	 * <p>
	 * Name: setIndex
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_177482_a = McMappingDatabase.getSRG("NibbleArray.func_177482_a");

	/**
	 * <p>
	 * Name: isLowerNibble
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_177479_b = McMappingDatabase.getSRG("NibbleArray.func_177479_b");

	/**
	 * <p>
	 * Name: getNibbleIndex
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_177478_c = McMappingDatabase.getSRG("NibbleArray.func_177478_c");

	/**
	 * <p>
	 * Name: getCoordinateIndex
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_177483_b = McMappingDatabase.getSRG("NibbleArray.func_177483_b");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_76581_a = McMappingDatabase.getSRG("NibbleArray.func_76581_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_76585_a = McMappingDatabase.getSRG("field_76585_a");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_76582_a = McMappingDatabase.getSRG("NibbleArray.func_76582_a");

	/**
	 * <p>
	 * Name: getFromIndex
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_177480_a = McMappingDatabase.getSRG("NibbleArray.func_177480_a");

}
