package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataSerializers {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "na";
		else
			return "net/minecraft/network/datasync/DataSerializers";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "na";
		else
			return "DataSerializers";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lna;";
		else
			return "Lnet/minecraft/network/datasync/DataSerializers;";
	}

	/**
	 * <p>
	 * Name: STRING
	 * </p>
	 */
	public static McObfPair field_187194_d = McMappingDatabase.getSRG("field_187194_d");

	/**
	 * <p>
	 * Name: getSerializerId
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataSerializer;)I]
	 * </p>
	 */
	public static McObfPair func_187188_b = McMappingDatabase.getSRG("DataSerializers.func_187188_b");

	/**
	 * <p>
	 * Name: ITEM_STACK
	 * </p>
	 */
	public static McObfPair field_187196_f = McMappingDatabase.getSRG("field_187196_f");

	/**
	 * <p>
	 * Name: getSerializer
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/network/datasync/DataSerializer;]
	 * </p>
	 */
	public static McObfPair func_187190_a = McMappingDatabase.getSRG("DataSerializers.func_187190_a");

	/**
	 * <p>
	 * Name: OPTIONAL_UNIQUE_ID
	 * </p>
	 */
	public static McObfPair field_187203_m = McMappingDatabase.getSRG("field_187203_m");

	/**
	 * <p>
	 * Name: OPTIONAL_BLOCK_STATE
	 * </p>
	 */
	public static McObfPair field_187197_g = McMappingDatabase.getSRG("field_187197_g");

	/**
	 * <p>
	 * Name: COMPOUND_TAG
	 * </p>
	 */
	public static McObfPair field_192734_n = McMappingDatabase.getSRG("field_192734_n");

	/**
	 * <p>
	 * Name: OPTIONAL_BLOCK_POS
	 * </p>
	 */
	public static McObfPair field_187201_k = McMappingDatabase.getSRG("field_187201_k");

	/**
	 * <p>
	 * Name: FLOAT
	 * </p>
	 */
	public static McObfPair field_187193_c = McMappingDatabase.getSRG("field_187193_c");

	/**
	 * <p>
	 * Name: BOOLEAN
	 * </p>
	 */
	public static McObfPair field_187198_h = McMappingDatabase.getSRG("field_187198_h");

	/**
	 * <p>
	 * Name: registerSerializer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataSerializer;)V]
	 * </p>
	 */
	public static McObfPair func_187189_a = McMappingDatabase.getSRG("DataSerializers.func_187189_a");

	/**
	 * <p>
	 * Name: ROTATIONS
	 * </p>
	 */
	public static McObfPair field_187199_i = McMappingDatabase.getSRG("field_187199_i");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_187204_n = McMappingDatabase.getSRG("field_187204_n");

	/**
	 * <p>
	 * Name: TEXT_COMPONENT
	 * </p>
	 */
	public static McObfPair field_187195_e = McMappingDatabase.getSRG("field_187195_e");

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_187202_l = McMappingDatabase.getSRG("field_187202_l");

	/**
	 * <p>
	 * Name: BLOCK_POS
	 * </p>
	 */
	public static McObfPair field_187200_j = McMappingDatabase.getSRG("field_187200_j");

	/**
	 * <p>
	 * Name: VARINT
	 * </p>
	 */
	public static McObfPair field_187192_b = McMappingDatabase.getSRG("field_187192_b");

	/**
	 * <p>
	 * Name: BYTE
	 * </p>
	 */
	public static McObfPair field_187191_a = McMappingDatabase.getSRG("field_187191_a");

}
