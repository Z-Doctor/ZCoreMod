package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brq";
		else
			return "net/minecraft/client/model/ModelBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brq";
		else
			return "ModelBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrq;";
		else
			return "Lnet/minecraft/client/model/ModelBox;";
	}

	/**
	 * <p>
	 * Name: boxName
	 * </p>
	 */
	public static McObfPair field_78247_g = McMappingDatabase.getSRG("field_78247_g");

	/**
	 * <p>
	 * Name: posX1
	 * </p>
	 */
	public static McObfPair field_78252_a = McMappingDatabase.getSRG("field_78252_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;F)V]
	 * </p>
	 */
	public static McObfPair func_178780_a = McMappingDatabase.getSRG("ModelBox.func_178780_a");

	/**
	 * <p>
	 * Name: posX2
	 * </p>
	 */
	public static McObfPair field_78248_d = McMappingDatabase.getSRG("field_78248_d");

	/**
	 * <p>
	 * Name: setBoxName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/model/ModelBox;]
	 * </p>
	 */
	public static McObfPair func_78244_a = McMappingDatabase.getSRG("ModelBox.func_78244_a");

	/**
	 * <p>
	 * Name: posZ1
	 * </p>
	 */
	public static McObfPair field_78251_c = McMappingDatabase.getSRG("field_78251_c");

	/**
	 * <p>
	 * Name: posZ2
	 * </p>
	 */
	public static McObfPair field_78246_f = McMappingDatabase.getSRG("field_78246_f");

	/**
	 * <p>
	 * Name: posY1
	 * </p>
	 */
	public static McObfPair field_78250_b = McMappingDatabase.getSRG("field_78250_b");

	/**
	 * <p>
	 * Name: quadList
	 * </p>
	 */
	public static McObfPair field_78254_i = McMappingDatabase.getSRG("field_78254_i");

	/**
	 * <p>
	 * Name: vertexPositions
	 * </p>
	 */
	public static McObfPair field_78253_h = McMappingDatabase.getSRG("field_78253_h");

	/**
	 * <p>
	 * Name: posY2
	 * </p>
	 */
	public static McObfPair field_78249_e = McMappingDatabase.getSRG("field_78249_e");

}
