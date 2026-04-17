# ShopFusion Folder Structure

## Root
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\README.md` Main project overview
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\DOCUMENTATION_INDEX.md` Documentation landing page
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\ARCHITECTURE.md` System architecture details
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\API_DOCUMENTATION.md` REST API reference
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\DATABASE_SCHEMA.md` Database schema and ER diagrams
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\FEATURES.md` Feature inventory
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\WORKFLOW.md` End-to-end workflows
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\DEPLOYMENT.md` Deployment guide
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\SECURITY.md` Security design
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\CONTRIBUTING.md` Contribution guide
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\ShopFusion_Documentation.md` Expanded project documentation
- `C:\Users\anupa\OneDrive\Desktop\ShopFusion\PROJECT_REPORT.md` Project report and interview material

## Frontend: `ShopFusionFrontend/`
- `package.json` Frontend dependencies and scripts
- `.env`, `.env.example`, `.env.local` API base URL configuration
- `index.html` Vite HTML entry
- `src/` React source
- `src/routes/Routes.jsx` App routing for customer and admin pages
- `src/pages/` Customer and auth screens
- `src/admin/` Admin layout, pages, and services
- `src/components/` Shared UI components
- `src/styles/` Application styles
- `public/` Static assets used by the UI
- `dist/` Production build output

## Backend: `shopfusionBackEnd/`
- `pom.xml` Maven configuration and dependencies
- `Dockerfile` Backend container build
- `src/main/java/com/shopfusion/backend/` Application code
- `controller/` Customer APIs
- `admin/controller/` Admin APIs
- `service/` Business logic and workflows
- `repository/` Spring Data JPA repositories
- `entity/` JPA entity models and enums
- `filter/` AuthenticationFilter
- `config/` Application configuration and admin bootstrap
- `src/main/resources/` Properties, SQL scripts, email templates
- `src/test/` Tests

## Dashboard Template: `dashboard_import/`
- `react-admin-dashboard-master/` Standalone admin dashboard template project

## Build and Tooling
- `target/` Maven build output
- `dist/` Vite build output
- `.vscode/` Editor settings
