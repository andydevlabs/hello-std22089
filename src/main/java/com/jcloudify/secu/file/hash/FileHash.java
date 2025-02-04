package com.jcloudify.secu.file.hash;

import com.jcloudify.secu.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
