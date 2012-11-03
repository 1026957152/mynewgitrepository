/**
 */
package my.webpage.model.defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.webpage.model.defaultname.Category#getName <em>Name</em>}</li>
 *   <li>{@link my.webpage.model.defaultname.Category#getArticles <em>Articles</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.webpage.model.defaultname.DefaultnamePackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link my.webpage.model.defaultname.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference.
	 * @see #setArticles(Aricle)
	 * @see my.webpage.model.defaultname.DefaultnamePackage#getCategory_Articles()
	 * @model containment="true"
	 * @generated
	 */
	Aricle getArticles();

	/**
	 * Sets the value of the '{@link my.webpage.model.defaultname.Category#getArticles <em>Articles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Articles</em>' containment reference.
	 * @see #getArticles()
	 * @generated
	 */
	void setArticles(Aricle value);

} // Category
