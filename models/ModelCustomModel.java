// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCustomModel extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer cube;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public ModelCustomModel() {
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(base, 3.1416F, 0.0F, 0.0F);
		base.setTextureOffset(0, 16).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);

		cube = new ModelRenderer(this);
		cube.setRotationPoint(0.0F, 14.0F, 0.0F);
		cube.setTextureOffset(2, 1).addBox(-6.0F, -1.0F, -5.0F, 2.0F, 5.0F, 10.0F, 0.0F, false);
		cube.setTextureOffset(32, 1).addBox(4.0F, -1.0F, -5.0F, 2.0F, 5.0F, 10.0F, 0.0F, false);
		cube.setTextureOffset(38, 16).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 5.0F, 1.0F, 0.0F, false);
		cube.setTextureOffset(46, 22).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(1, 2).addBox(-2.0F, -15.0F, -6.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 24).addBox(4.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 24).addBox(-6.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(58, 29).addBox(-1.0F, -17.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(0, 24).addBox(2.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 24).addBox(-1.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 24).addBox(-4.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(0, 24).addBox(-4.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 24).addBox(-1.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 24).addBox(2.0F, -14.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 3.1416F, 0.0F);
		cube_r3.setTextureOffset(0, 24).addBox(2.0F, -14.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 24).addBox(-1.0F, -14.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 24).addBox(-4.0F, -14.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		cube.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}