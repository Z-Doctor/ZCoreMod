package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BufferBuilder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buk";
		else
			return "net/minecraft/client/renderer/BufferBuilder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buk";
		else
			return "BufferBuilder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuk;";
		else
			return "Lnet/minecraft/client/renderer/BufferBuilder;";
	}

	/**
	 * <p>
	 * Name: setVertexState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder$State;)V]
	 * </p>
	 */
	public static McObfPair func_178993_a = McMappingDatabase.getSRG("BufferBuilder.func_178993_a");

	/**
	 * <p>
	 * Name: begin
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/client/renderer/vertex/VertexFormat;)V]
	 * </p>
	 */
	public static McObfPair func_181668_a = McMappingDatabase.getSRG("BufferBuilder.func_181668_a");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 * <p>
	 * Desc: [(IIII)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_181669_b = McMappingDatabase.getSRG("BufferBuilder.func_181669_b");

	/**
	 * <p>
	 * Name: rawShortBuffer
	 * </p>
	 */
	public static McObfPair field_181676_c = McMappingDatabase.getSRG("field_181676_c");

	/**
	 * <p>
	 * Name: xOffset
	 * </p>
	 */
	public static McObfPair field_179004_l = McMappingDatabase.getSRG("field_179004_l");

	/**
	 * <p>
	 * Name: reset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178965_a = McMappingDatabase.getSRG("BufferBuilder.func_178965_a");

	/**
	 * <p>
	 * Name: noColor
	 * </p>
	 */
	public static McObfPair field_78939_q = McMappingDatabase.getSRG("field_78939_q");

	/**
	 * <p>
	 * Name: byteBuffer
	 * </p>
	 */
	public static McObfPair field_179001_a = McMappingDatabase.getSRG("field_179001_a");

	/**
	 * <p>
	 * Name: addVertexData
	 * </p>
	 * <p>
	 * Desc: [([I)V]
	 * </p>
	 */
	public static McObfPair func_178981_a = McMappingDatabase.getSRG("BufferBuilder.func_178981_a");

	/**
	 * <p>
	 * Name: yOffset
	 * </p>
	 */
	public static McObfPair field_179005_m = McMappingDatabase.getSRG("field_179005_m");

	/**
	 * <p>
	 * Name: vertexFormat
	 * </p>
	 */
	public static McObfPair field_179011_q = McMappingDatabase.getSRG("field_179011_q");

	/**
	 * <p>
	 * Name: tex
	 * </p>
	 * <p>
	 * Desc: [(DD)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_187315_a = McMappingDatabase.getSRG("BufferBuilder.func_187315_a");

	/**
	 * <p>
	 * Name: drawMode
	 * </p>
	 */
	public static McObfPair field_179006_k = McMappingDatabase.getSRG("field_179006_k");

	/**
	 * <p>
	 * Name: putPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_178987_a = McMappingDatabase.getSRG("BufferBuilder.func_178987_a");

	/**
	 * <p>
	 * Name: getColorIndex
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_78909_a = McMappingDatabase.getSRG("BufferBuilder.func_78909_a");

	/**
	 * <p>
	 * Name: growBuffer
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_181670_b = McMappingDatabase.getSRG("BufferBuilder.func_181670_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_187316_a = McMappingDatabase.getSRG("field_187316_a");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_181662_b = McMappingDatabase.getSRG("BufferBuilder.func_181662_b");

	/**
	 * <p>
	 * Name: vertexFormatIndex
	 * </p>
	 */
	public static McObfPair field_181678_g = McMappingDatabase.getSRG("field_181678_g");

	/**
	 * <p>
	 * Name: vertexCount
	 * </p>
	 */
	public static McObfPair field_178997_d = McMappingDatabase.getSRG("field_178997_d");

	/**
	 * <p>
	 * Name: putBrightness4
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_178962_a = McMappingDatabase.getSRG("BufferBuilder.func_178962_a");

	/**
	 * <p>
	 * Name: rawFloatBuffer
	 * </p>
	 */
	public static McObfPair field_179000_c = McMappingDatabase.getSRG("field_179000_c");

	/**
	 * <p>
	 * Name: endVertex
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_181675_d = McMappingDatabase.getSRG("BufferBuilder.func_181675_d");

	/**
	 * <p>
	 * Name: sortVertexData
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_181674_a = McMappingDatabase.getSRG("BufferBuilder.func_181674_a");

	/**
	 * <p>
	 * Name: isDrawing
	 * </p>
	 */
	public static McObfPair field_179010_r = McMappingDatabase.getSRG("field_179010_r");

	/**
	 * <p>
	 * Name: putColorRGB_F4
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_178990_f = McMappingDatabase.getSRG("BufferBuilder.func_178990_f");

	/**
	 * <p>
	 * Name: vertexFormatElement
	 * </p>
	 */
	public static McObfPair field_181677_f = McMappingDatabase.getSRG("field_181677_f");

	/**
	 * <p>
	 * Name: nextVertexFormatIndex
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_181667_k = McMappingDatabase.getSRG("BufferBuilder.func_181667_k");

	/**
	 * <p>
	 * Name: setTranslation
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_178969_c = McMappingDatabase.getSRG("BufferBuilder.func_178969_c");

	/**
	 * <p>
	 * Name: putColorRGBA
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_178972_a = McMappingDatabase.getSRG("BufferBuilder.func_178972_a");

	/**
	 * <p>
	 * Name: putColor4
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178968_d = McMappingDatabase.getSRG("BufferBuilder.func_178968_d");

	/**
	 * <p>
	 * Name: normal
	 * </p>
	 * <p>
	 * Desc: [(FFF)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_181663_c = McMappingDatabase.getSRG("BufferBuilder.func_181663_c");

	/**
	 * <p>
	 * Name: noColor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78914_f = McMappingDatabase.getSRG("BufferBuilder.func_78914_f");

	/**
	 * <p>
	 * Name: getBufferSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181664_j = McMappingDatabase.getSRG("BufferBuilder.func_181664_j");

	/**
	 * <p>
	 * Name: getDrawMode
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178979_i = McMappingDatabase.getSRG("BufferBuilder.func_178979_i");

	/**
	 * <p>
	 * Name: rawIntBuffer
	 * </p>
	 */
	public static McObfPair field_178999_b = McMappingDatabase.getSRG("field_178999_b");

	/**
	 * <p>
	 * Name: getByteBuffer
	 * </p>
	 * <p>
	 * Desc: [()Ljava/nio/ByteBuffer;]
	 * </p>
	 */
	public static McObfPair func_178966_f = McMappingDatabase.getSRG("BufferBuilder.func_178966_f");

	/**
	 * <p>
	 * Name: putColor
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_192836_a = McMappingDatabase.getSRG("BufferBuilder.func_192836_a");

	/**
	 * <p>
	 * Name: getVertexCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178989_h = McMappingDatabase.getSRG("BufferBuilder.func_178989_h");

	/**
	 * <p>
	 * Name: putColorRGB_F
	 * </p>
	 * <p>
	 * Desc: [(FFFI)V]
	 * </p>
	 */
	public static McObfPair func_178994_b = McMappingDatabase.getSRG("BufferBuilder.func_178994_b");

	/**
	 * <p>
	 * Name: zOffset
	 * </p>
	 */
	public static McObfPair field_179002_n = McMappingDatabase.getSRG("field_179002_n");

	/**
	 * <p>
	 * Name: putNormal
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_178975_e = McMappingDatabase.getSRG("BufferBuilder.func_178975_e");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [(Ljava/nio/FloatBuffer;FFFII)F]
	 * </p>
	 */
	public static McObfPair func_181665_a = McMappingDatabase.getSRG("BufferBuilder.func_181665_a");

	/**
	 * <p>
	 * Name: getVertexState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BufferBuilder$State;]
	 * </p>
	 */
	public static McObfPair func_181672_a = McMappingDatabase.getSRG("BufferBuilder.func_181672_a");

	/**
	 * <p>
	 * Name: getVertexFormat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/vertex/VertexFormat;]
	 * </p>
	 */
	public static McObfPair func_178973_g = McMappingDatabase.getSRG("BufferBuilder.func_178973_g");

	/**
	 * <p>
	 * Name: lightmap
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_187314_a = McMappingDatabase.getSRG("BufferBuilder.func_187314_a");

	/**
	 * <p>
	 * Name: finishDrawing
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178977_d = McMappingDatabase.getSRG("BufferBuilder.func_178977_d");

	/**
	 * <p>
	 * Name: putColorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(FFFI)V]
	 * </p>
	 */
	public static McObfPair func_178978_a = McMappingDatabase.getSRG("BufferBuilder.func_178978_a");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_181666_a = McMappingDatabase.getSRG("BufferBuilder.func_181666_a");

}
