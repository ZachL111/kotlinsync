# kotlinsync

`kotlinsync` is a focused Kotlin codebase around plan safe file sync operations with content hashes and dry-run output. It is meant to be easy to inspect, run, and extend without a hosted service.

## Kotlinsync Walkthrough

I would read the project from the outside in: command, fixture, model, then roadmap. That keeps the automation idea grounded in files that can be checked locally.

## Reason For The Project

The repository exists to keep a technical idea small enough to reason about. The implementation avoids external dependencies where possible, then uses fixtures to make changes easy to review.

## How It Is Put Together

The project is organized around a compact model rather than a large framework. Inputs are scored, classified, and checked against golden fixtures. The constants live in code and are mirrored in metadata so documentation drift is easy to catch. The Kotlin version keeps data classes and model logic close together for a JVM-friendly core.

## Data Notes

The examples are meant to be readable before they are exhaustive. They cover enough variation to show how latency and risk can pull a decision below the threshold.

## Capabilities

- Uses fixture data to keep file plans changes visible in code review.
- Includes extended examples for safety rails, including `surge` and `degraded`.
- Documents idempotent checks tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.
- Stores project constants and verification metadata in `metadata/project.json`.

## Getting It Running

The only required setup is the local Kotlin toolchain. After cloning, stay in the repo root so fixture paths resolve correctly.

## Check The Work

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Where Things Live

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Tradeoffs

The examples cover useful edges, not every edge. A larger version would add malformed-input tests, richer reports, and deeper domain parsers.

## Possible Extensions

- Add a short report command that prints the score breakdown for a single scenario.
- Add malformed input fixtures so the failure path is as visible as the happy path.
- Split the scoring constants into a typed configuration object and validate it before use.
- Add one more automation fixture that focuses on a malformed or borderline input.

## Command Examples

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.
