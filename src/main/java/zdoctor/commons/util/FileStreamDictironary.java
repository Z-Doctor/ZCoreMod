package zdoctor.commons.util;

import java.io.File;
import java.io.FileOutputStream;

public class FileStreamDictironary extends NodeDictionary<Character, FileOutputStream> {

	public FileOutputStream lookUp(String key) {
		return super.lookUp(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean hasKey(String key) {
		return super.hasKey(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean register(String keys, FileOutputStream value) {
		return super.register(PrimitiveUtil.toCharacterArray(keys), value);
	}

	@Override
	public Character[][] searchSimilarKeys(Character[] partialKey) {
		return new Character[0][];
	}

	@Override
	public FileOutputStream[] searchSimilarValues(FileOutputStream partialValue) {
		return new FileOutputStream[0];
	}

}
