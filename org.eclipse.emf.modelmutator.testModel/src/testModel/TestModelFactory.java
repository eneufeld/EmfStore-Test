/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testModel.TestModelPackage
 * @generated
 */
public interface TestModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestModelFactory eINSTANCE = testModel.impl.TestModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kategorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kategorie</em>'.
	 * @generated
	 */
	Kategorie createKategorie();

	/**
	 * Returns a new object of class '<em>Contained Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contained Element</em>'.
	 * @generated
	 */
	ContainedElement createContainedElement();

	/**
	 * Returns a new object of class '<em>referenziertes Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>referenziertes Element</em>'.
	 * @generated
	 */
	referenziertesElement createreferenziertesElement();

	/**
	 * Returns a new object of class '<em>multi Ref Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>multi Ref Element</em>'.
	 * @generated
	 */
	multiRefElement createmultiRefElement();

	/**
	 * Returns a new object of class '<em>upper Bound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>upper Bound</em>'.
	 * @generated
	 */
	upperBound createupperBound();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestModelPackage getTestModelPackage();

} //TestModelFactory
