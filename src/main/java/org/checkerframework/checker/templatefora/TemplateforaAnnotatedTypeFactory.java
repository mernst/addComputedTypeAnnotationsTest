package org.checkerframework.checker.templatefora;

import com.sun.source.tree.Tree;
import javax.lang.model.element.Element;
import org.checkerframework.common.basetype.BaseAnnotatedTypeFactory;
import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.framework.type.AnnotatedTypeMirror;

public class TemplateforaAnnotatedTypeFactory extends BaseAnnotatedTypeFactory {

  /** Creates a TemplateforaAnnotatedTypeFactory. */
  public TemplateforaAnnotatedTypeFactory(BaseTypeChecker checker) {
    super(checker);
    this.postInit();
  }

  @Override
  public void addComputedTypeAnnotations(Element elt, AnnotatedTypeMirror type) {
    super.addComputedTypeAnnotations(elt, type);

    System.out.printf("%n");
    System.out.printf("Element: %s  [%s]%n", elt, elt.getClass());
    System.out.printf("Kind: %s%n", elt.getKind());
    System.out.printf("Type: %s  [%s]%n", type, type.getClass());

    System.out.printf("%n");
  }

  @Override
  protected void addComputedTypeAnnotations(Tree tree, AnnotatedTypeMirror type, boolean iUseFlow) {
    super.addComputedTypeAnnotations(tree, type, iUseFlow);
    System.out.printf(
        "Tree: %s%nKind: %s%nType: %s [%s]%n%n", tree, tree.getKind(), type, type.getClass());
  }
}
