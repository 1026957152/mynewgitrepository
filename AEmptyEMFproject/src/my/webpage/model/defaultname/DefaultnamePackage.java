/**
 */
package my.webpage.model.defaultname;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see my.webpage.model.defaultname.DefaultnameFactory
 * @model kind="package"
 * @generated
 */
public interface DefaultnamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "defaultname";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://defaultname/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "defaultname";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DefaultnamePackage eINSTANCE = my.webpage.model.defaultname.impl.DefaultnamePackageImpl.init();

	/**
	 * The meta object id for the '{@link my.webpage.model.defaultname.impl.WebImpl <em>Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.webpage.model.defaultname.impl.WebImpl
	 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getWeb()
	 * @generated
	 */
	int WEB = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__CATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link my.webpage.model.defaultname.impl.WebpageImpl <em>Webpage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.webpage.model.defaultname.impl.WebpageImpl
	 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getWebpage()
	 * @generated
	 */
	int WEBPAGE = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__PAGES = 0;

	/**
	 * The number of structural features of the '<em>Webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link my.webpage.model.defaultname.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.webpage.model.defaultname.impl.CategoryImpl
	 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ARTICLES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link my.webpage.model.defaultname.impl.AricleImpl <em>Aricle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see my.webpage.model.defaultname.impl.AricleImpl
	 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getAricle()
	 * @generated
	 */
	int ARICLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARICLE__CREATED = 1;

	/**
	 * The number of structural features of the '<em>Aricle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARICLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>celendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getcelendar()
	 * @generated
	 */
	int CELENDAR = 4;


	/**
	 * Returns the meta object for class '{@link my.webpage.model.defaultname.Web <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web</em>'.
	 * @see my.webpage.model.defaultname.Web
	 * @generated
	 */
	EClass getWeb();

	/**
	 * Returns the meta object for the reference '{@link my.webpage.model.defaultname.Web#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see my.webpage.model.defaultname.Web#getEReference0()
	 * @see #getWeb()
	 * @generated
	 */
	EReference getWeb_EReference0();

	/**
	 * Returns the meta object for the containment reference '{@link my.webpage.model.defaultname.Web#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see my.webpage.model.defaultname.Web#getCategories()
	 * @see #getWeb()
	 * @generated
	 */
	EReference getWeb_Categories();

	/**
	 * Returns the meta object for class '{@link my.webpage.model.defaultname.Webpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webpage</em>'.
	 * @see my.webpage.model.defaultname.Webpage
	 * @generated
	 */
	EClass getWebpage();

	/**
	 * Returns the meta object for the containment reference list '{@link my.webpage.model.defaultname.Webpage#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see my.webpage.model.defaultname.Webpage#getPages()
	 * @see #getWebpage()
	 * @generated
	 */
	EReference getWebpage_Pages();

	/**
	 * Returns the meta object for class '{@link my.webpage.model.defaultname.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see my.webpage.model.defaultname.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link my.webpage.model.defaultname.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see my.webpage.model.defaultname.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference '{@link my.webpage.model.defaultname.Category#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Articles</em>'.
	 * @see my.webpage.model.defaultname.Category#getArticles()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Articles();

	/**
	 * Returns the meta object for class '{@link my.webpage.model.defaultname.Aricle <em>Aricle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aricle</em>'.
	 * @see my.webpage.model.defaultname.Aricle
	 * @generated
	 */
	EClass getAricle();

	/**
	 * Returns the meta object for the attribute '{@link my.webpage.model.defaultname.Aricle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see my.webpage.model.defaultname.Aricle#getName()
	 * @see #getAricle()
	 * @generated
	 */
	EAttribute getAricle_Name();

	/**
	 * Returns the meta object for the attribute '{@link my.webpage.model.defaultname.Aricle#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see my.webpage.model.defaultname.Aricle#getCreated()
	 * @see #getAricle()
	 * @generated
	 */
	EAttribute getAricle_Created();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>celendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>celendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getcelendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DefaultnameFactory getDefaultnameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link my.webpage.model.defaultname.impl.WebImpl <em>Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.webpage.model.defaultname.impl.WebImpl
		 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getWeb()
		 * @generated
		 */
		EClass WEB = eINSTANCE.getWeb();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__EREFERENCE0 = eINSTANCE.getWeb_EReference0();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__CATEGORIES = eINSTANCE.getWeb_Categories();

		/**
		 * The meta object literal for the '{@link my.webpage.model.defaultname.impl.WebpageImpl <em>Webpage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.webpage.model.defaultname.impl.WebpageImpl
		 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getWebpage()
		 * @generated
		 */
		EClass WEBPAGE = eINSTANCE.getWebpage();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBPAGE__PAGES = eINSTANCE.getWebpage_Pages();

		/**
		 * The meta object literal for the '{@link my.webpage.model.defaultname.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.webpage.model.defaultname.impl.CategoryImpl
		 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ARTICLES = eINSTANCE.getCategory_Articles();

		/**
		 * The meta object literal for the '{@link my.webpage.model.defaultname.impl.AricleImpl <em>Aricle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see my.webpage.model.defaultname.impl.AricleImpl
		 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getAricle()
		 * @generated
		 */
		EClass ARICLE = eINSTANCE.getAricle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARICLE__NAME = eINSTANCE.getAricle_Name();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARICLE__CREATED = eINSTANCE.getAricle_Created();

		/**
		 * The meta object literal for the '<em>celendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see my.webpage.model.defaultname.impl.DefaultnamePackageImpl#getcelendar()
		 * @generated
		 */
		EDataType CELENDAR = eINSTANCE.getcelendar();

	}

} //DefaultnamePackage
