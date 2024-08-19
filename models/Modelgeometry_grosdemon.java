// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelgeometry_grosdemon extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer corne_gauche;
	private final ModelRenderer corne_droit;
	private final ModelRenderer corne_hd_r1;
	private final ModelRenderer corne_bd_r1;
	private final ModelRenderer body;
	private final ModelRenderer colonevert_h_r1;
	private final ModelRenderer colonevert_b_r1;
	private final ModelRenderer bras_gauche;
	private final ModelRenderer bras_gauche_r1;
	private final ModelRenderer bras_droit;
	private final ModelRenderer bb_main;

	public Modelgeometry_grosdemon() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.texOffs(114, 117).addBox(-3.0F, -35.0F, -14.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		head.texOffs(0, 26).addBox(-5.0F, -38.0F, -12.5F, 10.0F, 11.0F, 9.0F, 0.0F, false);

		corne_gauche = new ModelRenderer(this);
		corne_gauche.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(corne_gauche);
		setRotationAngle(corne_gauche, 2.224F, 0.4008F, 2.4418F);
		corne_gauche.texOffs(112, 124).addBox(-23.0F, -27.0F, -8.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		corne_gauche.texOffs(112, 124).addBox(-25.0F, -30.0F, -9.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		corne_droit = new ModelRenderer(this);
		corne_droit.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(corne_droit);

		corne_hd_r1 = new ModelRenderer(this);
		corne_hd_r1.setPos(0.0F, 0.0F, 0.0F);
		corne_droit.addChild(corne_hd_r1);
		setRotationAngle(corne_hd_r1, 0.0555F, 0.5648F, 0.1034F);
		corne_hd_r1.texOffs(112, 124).addBox(-8.0F, -37.0F, -11.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		corne_bd_r1 = new ModelRenderer(this);
		corne_bd_r1.setPos(0.0F, 0.0F, 0.0F);
		corne_droit.addChild(corne_bd_r1);
		setRotationAngle(corne_bd_r1, 0.0608F, 0.4323F, 0.1443F);
		corne_bd_r1.texOffs(112, 124).addBox(-10.0F, -34.0F, -11.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(body, 0.3927F, 0.0F, 0.0F);
		body.texOffs(0, 0).addBox(-9.0F, -29.0F, 0.0F, 18.0F, 17.0F, 9.0F, 0.0F, false);
		body.texOffs(64, 113).addBox(4.0F, -27.0F, 8.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		body.texOffs(72, 113).addBox(-6.0F, -27.0F, 8.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		body.texOffs(120, 113).addBox(-8.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.texOffs(112, 113).addBox(6.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		colonevert_h_r1 = new ModelRenderer(this);
		colonevert_h_r1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(colonevert_h_r1);
		setRotationAngle(colonevert_h_r1, 0.3054F, 0.0F, 0.0F);
		colonevert_h_r1.texOffs(115, 124).addBox(-1.0F, -22.0F, 15.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		colonevert_b_r1 = new ModelRenderer(this);
		colonevert_b_r1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(colonevert_b_r1);
		setRotationAngle(colonevert_b_r1, -0.3491F, 0.0F, 0.0F);
		colonevert_b_r1.texOffs(120, 124).addBox(-1.0F, -20.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bras_gauche = new ModelRenderer(this);
		bras_gauche.setPos(0.0F, 24.0F, 0.0F);

		bras_gauche_r1 = new ModelRenderer(this);
		bras_gauche_r1.setPos(0.0F, 0.0F, 0.0F);
		bras_gauche.addChild(bras_gauche_r1);
		setRotationAngle(bras_gauche_r1, -0.1745F, 0.0F, 0.0F);
		bras_gauche_r1.texOffs(0, 46).addBox(9.0F, -25.5F, -14.0F, 5.0F, 27.0F, 7.0F, 0.0F, false);

		bras_droit = new ModelRenderer(this);
		bras_droit.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(bras_droit, -0.1745F, 0.0F, 0.0F);
		bras_droit.texOffs(38, 26).addBox(-14.0F, -24.5F, -14.0F, 5.0F, 27.0F, 7.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(55, 55).addBox(1.5F, -16.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
		bb_main.texOffs(54, 0).addBox(-7.5F, -16.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bras_gauche.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bras_droit.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}