/**
 */
package my.webpage.model.defaultname;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see my.webpage.model.defaultname.DefaultnamePackage
 * @generated
 */
public interface DefaultnameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DefaultnameFactory eINSTANCE = my.webpage.model.defaultname.impl.DefaultnameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web</em>'.
	 * @generated
	 */
	Web createWeb();

	/**
	 * Returns a new object of class '<em>Webpage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Webpage</em>'.
	 * @generated
	 */
	Webpage createWebpage();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Aricle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aricle</em>'.
	 * @generated
	 */
	Aricle createAricle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DefaultnamePackage getDefaultnamePackage();

} //DefaultnameFactory
