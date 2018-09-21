package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBoat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpj";
		else
			return "net/minecraft/client/model/ModelBoat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpj";
		else
			return "ModelBoat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpj;";
		else
			return "Lnet/minecraft/client/model/ModelBoat;";
	}

	/**
	 * <p>
	 * Name: patchList
	 * </p>
	 */
	public static McObfPair field_187059_d = McMappingDatabase.getSRG("field_187059_d");

	/**
	 * <p>
	 * Name: renderMultipass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_187054_b = McMappingDatabase.getSRG("ModelBoat.func_187054_b");

	/**
	 * <p>
	 * Name: renderPaddle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityBoat;IFF)V]
	 * </p>
	 */
	public static McObfPair func_187055_a = McMappingDatabase.getSRG("ModelBoat.func_187055_a");

	/**
	 * <p>
	 * Name: boatSides
	 * </p>
	 */
	public static McObfPair field_78103_a = McMappingDatabase.getSRG("field_78103_a");

	/**
	 * <p>
	 * Name: noWater
	 * </p>
	 */
	public static McObfPair field_187058_c = McMappingDatabase.getSRG("field_187058_c");

	/**
	 * <p>
	 * Name: paddles
	 * </p>
	 */
	public static McObfPair field_187057_b = McMappingDatabase.getSRG("field_187057_b");

	/**
	 * <p>
	 * Name: makePaddle
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_187056_a = McMappingDatabase.getSRG("ModelBoat.func_187056_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelBoat.func_78088_a");

}
