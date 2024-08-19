// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCoeur extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer cube;
	private final ModelRenderer glass;

	public ModelCoeur() {
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(base, 3.1416F, 0.0F, 0.0F);
		base.setTextureOffset(0, 16).addBox(-6.0F, 1.0F, -6.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);

		cube = new ModelRenderer(this);
		cube.setRotationPoint(0.0F, 14.0F, 0.0F);
		cube.setTextureOffset(32, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		glass = new ModelRenderer(this);
		glass.setRotationPoint(0.0F, 14.0F, 0.0F);
		glass.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		cube.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		glass.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}