# Contributing to ShopFusion

## How to Contribute
1. Fork the repo and create a branch
2. Make focused changes with clear commit messages
3. Add or update documentation and tests when needed
4. Open a pull request with a summary of changes

## Development Setup
Backend
```bash
cd shopfusionBackEnd
./mvnw spring-boot:run
```

Frontend
```bash
cd ShopFusionFrontend
npm install
npm run dev
```

## Code Style
- Java: follow standard Spring Boot conventions
- React: use existing functional component patterns
- Keep API responses consistent with current controllers

## Testing
Backend tests live in `shopfusionBackEnd\src\test`.
```bash
cd shopfusionBackEnd
./mvnw test
```

Frontend lint
```bash
cd ShopFusionFrontend
npm run lint
```

## Documentation
- Update README and related docs when adding features
- Maintain API documentation for any endpoint changes
- Keep database schema docs in sync with entity updates

## Branch Naming
Use descriptive branch names, for example:
- `feature/add-wishlist`
- `fix/payment-verification`

## Pull Request Checklist
- Code compiles and app runs
- Tests pass or are not applicable
- Documentation updated
- No secrets committed
